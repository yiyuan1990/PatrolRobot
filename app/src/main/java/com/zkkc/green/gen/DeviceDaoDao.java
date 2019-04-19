package com.zkkc.green.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zkkc.patrolrobot.entity.DeviceDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DEVICE_DAO".
*/
public class DeviceDaoDao extends AbstractDao<DeviceDao, Long> {

    public static final String TABLENAME = "DEVICE_DAO";

    /**
     * Properties of entity DeviceDao.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property DName = new Property(1, String.class, "dName", false, "D_NAME");
        public final static Property DSer = new Property(2, String.class, "dSer", false, "D_SER");
        public final static Property DWifi = new Property(3, String.class, "dWifi", false, "D_WIFI");
        public final static Property IsCheck = new Property(4, int.class, "isCheck", false, "IS_CHECK");
        public final static Property IsShowXb = new Property(5, int.class, "isShowXb", false, "IS_SHOW_XB");
    }


    public DeviceDaoDao(DaoConfig config) {
        super(config);
    }
    
    public DeviceDaoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DEVICE_DAO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"D_NAME\" TEXT," + // 1: dName
                "\"D_SER\" TEXT," + // 2: dSer
                "\"D_WIFI\" TEXT," + // 3: dWifi
                "\"IS_CHECK\" INTEGER NOT NULL ," + // 4: isCheck
                "\"IS_SHOW_XB\" INTEGER NOT NULL );"); // 5: isShowXb
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DEVICE_DAO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DeviceDao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String dName = entity.getDName();
        if (dName != null) {
            stmt.bindString(2, dName);
        }
 
        String dSer = entity.getDSer();
        if (dSer != null) {
            stmt.bindString(3, dSer);
        }
 
        String dWifi = entity.getDWifi();
        if (dWifi != null) {
            stmt.bindString(4, dWifi);
        }
        stmt.bindLong(5, entity.getIsCheck());
        stmt.bindLong(6, entity.getIsShowXb());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DeviceDao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String dName = entity.getDName();
        if (dName != null) {
            stmt.bindString(2, dName);
        }
 
        String dSer = entity.getDSer();
        if (dSer != null) {
            stmt.bindString(3, dSer);
        }
 
        String dWifi = entity.getDWifi();
        if (dWifi != null) {
            stmt.bindString(4, dWifi);
        }
        stmt.bindLong(5, entity.getIsCheck());
        stmt.bindLong(6, entity.getIsShowXb());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DeviceDao readEntity(Cursor cursor, int offset) {
        DeviceDao entity = new DeviceDao( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // dName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // dSer
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dWifi
            cursor.getInt(offset + 4), // isCheck
            cursor.getInt(offset + 5) // isShowXb
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DeviceDao entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDSer(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDWifi(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIsCheck(cursor.getInt(offset + 4));
        entity.setIsShowXb(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DeviceDao entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DeviceDao entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DeviceDao entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
