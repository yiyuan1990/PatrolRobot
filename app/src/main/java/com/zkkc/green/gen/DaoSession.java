package com.zkkc.green.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.zkkc.patrolrobot.entity.LocationDetailsDao;
import com.zkkc.patrolrobot.entity.ShootAngleDao;
import com.zkkc.patrolrobot.entity.DeviceDao;

import com.zkkc.green.gen.LocationDetailsDaoDao;
import com.zkkc.green.gen.ShootAngleDaoDao;
import com.zkkc.green.gen.DeviceDaoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig locationDetailsDaoDaoConfig;
    private final DaoConfig shootAngleDaoDaoConfig;
    private final DaoConfig deviceDaoDaoConfig;

    private final LocationDetailsDaoDao locationDetailsDaoDao;
    private final ShootAngleDaoDao shootAngleDaoDao;
    private final DeviceDaoDao deviceDaoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        locationDetailsDaoDaoConfig = daoConfigMap.get(LocationDetailsDaoDao.class).clone();
        locationDetailsDaoDaoConfig.initIdentityScope(type);

        shootAngleDaoDaoConfig = daoConfigMap.get(ShootAngleDaoDao.class).clone();
        shootAngleDaoDaoConfig.initIdentityScope(type);

        deviceDaoDaoConfig = daoConfigMap.get(DeviceDaoDao.class).clone();
        deviceDaoDaoConfig.initIdentityScope(type);

        locationDetailsDaoDao = new LocationDetailsDaoDao(locationDetailsDaoDaoConfig, this);
        shootAngleDaoDao = new ShootAngleDaoDao(shootAngleDaoDaoConfig, this);
        deviceDaoDao = new DeviceDaoDao(deviceDaoDaoConfig, this);

        registerDao(LocationDetailsDao.class, locationDetailsDaoDao);
        registerDao(ShootAngleDao.class, shootAngleDaoDao);
        registerDao(DeviceDao.class, deviceDaoDao);
    }
    
    public void clear() {
        locationDetailsDaoDaoConfig.clearIdentityScope();
        shootAngleDaoDaoConfig.clearIdentityScope();
        deviceDaoDaoConfig.clearIdentityScope();
    }

    public LocationDetailsDaoDao getLocationDetailsDaoDao() {
        return locationDetailsDaoDao;
    }

    public ShootAngleDaoDao getShootAngleDaoDao() {
        return shootAngleDaoDao;
    }

    public DeviceDaoDao getDeviceDaoDao() {
        return deviceDaoDao;
    }

}
