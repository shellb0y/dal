package com.ctrip.platform.dal.sharding.idgen;

public interface IIdGeneratorConfig {

    IdGenerator getIdGenerator(String name);

    String getSequenceDbName();

    int warmUp();

}
