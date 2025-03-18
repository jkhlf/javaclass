
package com.aula;

public enum Status {
    ON(true), OFF(false);

    private final boolean status;

    Status(boolean status){
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

}
