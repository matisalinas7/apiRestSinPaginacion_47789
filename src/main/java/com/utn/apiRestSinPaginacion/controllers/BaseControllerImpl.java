package com.utn.apiRestSinPaginacion.controllers;

import com.utn.apiRestSinPaginacion.entities.Base;
import com.utn.apiRestSinPaginacion.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E,Long>> implements BaseController<E, Long> {

    @Autowired
    protected S servicio;
}
