package com.test.transaction.service;

import javax.transaction.Transactional;

public interface AbstractHumanService {
    @Transactional
    void saveHuman ();
}
