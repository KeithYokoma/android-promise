package com.anprosit.android.promise.internal;

import com.anprosit.android.promise.Task;

/**
 * Created by Hirofumi Nakagawa on 13/07/14.
 */
public interface PromiseContext {
    public State getState();

    public void cancel();

    public void done(Object result);

    public void fail(Object result, Exception exception);

    public Task<?, ?, ?> getNextTask();

    public enum State {
        READY,
        DOING,
        DONE,
        CANCELLED,
        FAILED,
        DESTROYED,
    }
}
