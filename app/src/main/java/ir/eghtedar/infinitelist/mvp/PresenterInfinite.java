package ir.eghtedar.infinitelist.mvp;

import android.annotation.SuppressLint;
import android.util.Log;
import android.widget.Toast;

import org.reactivestreams.Publisher;

import java.util.List;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.schedulers.Schedulers;
import ir.eghtedar.infinitelist.Presenter;
import ir.eghtedar.infinitelist.datamodel.Good;
import ir.eghtedar.infinitelist.datamodel.Item;
import ir.eghtedar.infinitelist.mvp.view.ViewInfinite;



public class PresenterInfinite implements Presenter {

    private ModelInfinite model;
    private ViewInfinite view;
    private int pageNumber=0;

    private final CompositeDisposable disposable=new CompositeDisposable();
    private PublishProcessor<Integer> paginator=PublishProcessor.create();


    public PresenterInfinite(ModelInfinite model, ViewInfinite view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onCreat() {
        disposable.add(subscribeForData());

        paginator.onNext(pageNumber);

        view.loadAtEndList(new ViewInfinite.Laoding() {
            @Override
            public void load() {
               pageNumber++;
                Log.i("pegah", "onCreat: "+pageNumber);
                paginator.onNext(pageNumber);
            }
        });

    }


    @Override
    public void onDestroy() {
  disposable.clear();
    }


    private Disposable subscribeForData(){


        return paginator.onBackpressureDrop()
            .concatMap(new Function<Integer, Publisher<List<Item>>>() {
                @Override
                public Publisher<List<Item>> apply(@NonNull Integer integer) throws Exception {
                    view.showLoding(true);

                    return dataFromNetwork(integer);
                }
            })

            .subscribe(new Consumer<List<Item>>() {
                @Override
                public void accept(List<Item> items) throws Exception {
                    view.setDatatoRecycler(items);
                    view.showLoding(false);

                }
            });

}
          private Flowable<List<Item>>  dataFromNetwork(final int page){


              return  Flowable.create(new FlowableOnSubscribe<List<Item>>() {
                  @SuppressLint("CheckResult")
                  @Override
                  public void subscribe(@NonNull final FlowableEmitter<List<Item>> emitter) throws Exception {
                      model.getDataList(page)
                              .subscribeOn(Schedulers.io())
                              .observeOn(AndroidSchedulers.mainThread())
                              .subscribe(new Consumer<Good>() {
                                  @Override
                                  public void accept(Good good) throws Exception {


                                       if(good.getItems().size()==0){
                                           //be safheye bade safhe akhar residim
                                           view.showLoding(false);

                                           Toast.makeText(view.getContext(), "End", Toast.LENGTH_SHORT).show();
                                       }
                                       else {

                                           emitter.onNext(good.getItems());
                                           emitter.onComplete();
                                       }
                                  }
                              });

                  }
              }, BackpressureStrategy.BUFFER);
          }



    @Override
    public void onPause() {

    }

    @Override
    public void onBack() {

    }

    @Override
    public void onStop() {

    }}


