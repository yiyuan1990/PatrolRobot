package com.zkkc.green.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zkkc.patrolrobot.entity.LocationDetailsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCATION_DETAILS_DAO".
*/
public class LocationDetailsDaoDao extends AbstractDao<LocationDetailsDao, Long> {

    public static final String TABLENAME = "LOCATION_DETAILS_DAO";

    /**
     * Properties of entity LocationDetailsDao.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property SerialNo = new Property(1, String.class, "serialNo", false, "SERIAL_NO");
        public final static Property TowerNo = new Property(2, String.class, "towerNo", false, "TOWER_NO");
        public final static Property TowerType = new Property(3, int.class, "towerType", false, "TOWER_TYPE");
        public final static Property Direction = new Property(4, int.class, "direction", false, "DIRECTION");
        public final static Property InCharge = new Property(5, int.class, "inCharge", false, "IN_CHARGE");
        public final static Property FzcNum = new Property(6, int.class, "fzcNum", false, "FZC_NUM");
        public final static Property MDate = new Property(7, String.class, "mDate", false, "M_DATE");
        public final static Property MCZR = new Property(8, String.class, "mCZR", false, "M_CZR");
    }


    public LocationDetailsDaoDao(DaoConfig config) {
        super(config);
    }
    
    public LocationDetailsDaoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCATION_DETAILS_DAO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"SERIAL_NO\" TEXT," + // 1: serialNo
                "\"TOWER_NO\" TEXT," + // 2: towerNo
                "\"TOWER_TYPE\" INTEGER NOT NULL ," + // 3: towerType
                "\"DIRECTION\" INTEGER NOT NULL ," + // 4: direction
                "\"IN_CHARGE\" INTEGER NOT NULL ," + // 5: inCharge
                "\"FZC_NUM\" INTEGER NOT NULL ," + // 6: fzcNum
                "\"M_DATE\" TEXT," + // 7: mDate
                "\"M_CZR\" TEXT);"); // 8: mCZR
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCATION_DETAILS_DAO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LocationDetailsDao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String serialNo = entity.getSerialNo();
        if (serialNo != null) {
            stmt.bindString(2, serialNo);
        }
 
        String towerNo = entity.getTowerNo();
        if (towerNo != null) {
            stmt.bindString(3, towerNo);
        }
        stmt.bindLong(4, entity.getTowerType());
        stmt.bindLong(5, entity.getDirection());
        stmt.bindLong(6, entity.getInCharge());
        stmt.bindLong(7, entity.getFzcNum());
 
        String mDate = entity.getMDate();
        if (mDate != null) {
            stmt.bindString(8, mDate);
        }
 
        String mCZR = entity.getMCZR();
        if (mCZR != null) {
            stmt.bindString(9, mCZR);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LocationDetailsDao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String serialNo = entity.getSerialNo();
        if (serialNo != null) {
            stmt.bindString(2, serialNo);
        }
 
        String towerNo = entity.getTowerNo();
        if (towerNo != null) {
            stmt.bindString(3, towerNo);
        }
        stmt.bindLong(4, entity.getTowerType());
        stmt.bindLong(5, entity.getDirection());
        stmt.bindLong(6, entity.getInCharge());
        stmt.bindLong(7, entity.getFzcNum());
 
        String mDate = entity.getMDate();
        if (mDate != null) {
            stmt.bindString(8, mDate);
        }
 
        String mCZR = entity.getMCZR();
        if (mCZR != null) {
            stmt.bindString(9, mCZR);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LocationDetailsDao readEntity(Cursor cursor, int offset) {
        LocationDetailsDao entity = new LocationDetailsDao( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // serialNo
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // towerNo
            cursor.getInt(offset + 3), // towerType
            cursor.getInt(offset + 4), // direction
            cursor.getInt(offset + 5), // inCharge
            cursor.getInt(offset + 6), // fzcNum
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // mDate
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // mCZR
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LocationDetailsDao entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSerialNo(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTowerNo(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTowerType(cursor.getInt(offset + 3));
        entity.setDirection(cursor.getInt(offset + 4));
        entity.setInCharge(cursor.getInt(offset + 5));
        entity.setFzcNum(cursor.getInt(offset + 6));
        entity.setMDate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMCZR(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LocationDetailsDao entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LocationDetailsDao entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LocationDetailsDao entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
