package com.utn.apiRestSinPaginacion.services;

import com.utn.apiRestSinPaginacion.entities.Base;
import com.utn.apiRestSinPaginacion.repositories.BaseRepository;

import java.io.Serializable;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository baseRepository;

    public BaseServiceImpl(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }

}
