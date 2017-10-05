package com.binkhack.data;

import com.binkhack.model.User;

import io.reactivex.Single;
import io.reactivex.subjects.PublishSubject;

public class RxBinkHackApi {

    private PublishSubject<Throwable> exceptionsSubject;
    private ApiClient apiClient;

    public RxBinkHackApi() {
        exceptionsSubject = PublishSubject.create();
        apiClient = new ApiClient();
    }

    public Single<User> getUser() {
        return Single.fromCallable(() -> apiClient.getUser())
                .doOnError(exceptionsSubject::onNext);
    }
}
