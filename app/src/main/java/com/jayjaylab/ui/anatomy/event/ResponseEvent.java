package com.jayjaylab.ui.anatomy.event;

import com.jayjaylab.ui.anatomy.event.id.ResponseId;

import java.util.Arrays;

/**
 * Created by jjkim on 2016. 7. 19..
 */
public class ResponseEvent {
    ResponseId id;
    Object[] args;

    public ResponseEvent(ResponseId id, Object... args) {
        this.id = id;
        this.args = args;
    }

    public ResponseId getId() {
        return id;
    }

    public void setId(ResponseId id) {
        this.id = id;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "ResponseEvent{" +
                "id=" + id +
                ", args=" + Arrays.toString(args) +
                '}';
    }
}
