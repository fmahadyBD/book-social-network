package com.fmahadybd.book.email;

import lombok.Getter;

@Getter
public enum EmailTempleteName {

        ACTIVATE_ACCOUNT("activate_account")

        ;

        private final String name;

        private EmailTempleteName(String name) {
            this.name = name;
        }

}
