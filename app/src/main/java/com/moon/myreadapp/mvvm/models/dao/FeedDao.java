package com.moon.myreadapp.mvvm.models.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FEED".
*/
public class FeedDao extends AbstractDao<Feed, Long> {

    public static final String TABLENAME = "FEED";

    /**
     * Properties of entity Feed.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Url = new Property(2, String.class, "url", false, "URL");
        public final static Property Status = new Property(3, Integer.class, "status", false, "STATUS");
        public final static Property Use_count = new Property(4, Integer.class, "use_count", false, "USE_COUNT");
        public final static Property Description = new Property(5, String.class, "description", false, "DESCRIPTION");
        public final static Property Feedtype = new Property(6, String.class, "feedtype", false, "FEEDTYPE");
        public final static Property Link = new Property(7, String.class, "link", false, "LINK");
        public final static Property Icon = new Property(8, String.class, "icon", false, "ICON");
        public final static Property Publishtime = new Property(9, java.util.Date.class, "publishtime", false, "PUBLISHTIME");
        public final static Property Update_time = new Property(10, java.util.Date.class, "update_time", false, "UPDATE_TIME");
        public final static Property Current_image = new Property(11, String.class, "current_image", false, "CURRENT_IMAGE");
        public final static Property Language = new Property(12, String.class, "language", false, "LANGUAGE");
        public final static Property Rights = new Property(13, String.class, "rights", false, "RIGHTS");
        public final static Property Uri = new Property(14, String.class, "uri", false, "URI");
        public final static Property Creator = new Property(15, String.class, "creator", false, "CREATOR");
        public final static Property User_id = new Property(16, long.class, "user_id", false, "USER_ID");
    }

    private DaoSession daoSession;


    public FeedDao(DaoConfig config) {
        super(config);
    }
    
    public FeedDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FEED\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TITLE\" TEXT NOT NULL ," + // 1: title
                "\"URL\" TEXT," + // 2: url
                "\"STATUS\" INTEGER," + // 3: status
                "\"USE_COUNT\" INTEGER," + // 4: use_count
                "\"DESCRIPTION\" TEXT," + // 5: description
                "\"FEEDTYPE\" TEXT," + // 6: feedtype
                "\"LINK\" TEXT," + // 7: link
                "\"ICON\" TEXT," + // 8: icon
                "\"PUBLISHTIME\" INTEGER," + // 9: publishtime
                "\"UPDATE_TIME\" INTEGER," + // 10: update_time
                "\"CURRENT_IMAGE\" TEXT," + // 11: current_image
                "\"LANGUAGE\" TEXT," + // 12: language
                "\"RIGHTS\" TEXT," + // 13: rights
                "\"URI\" TEXT," + // 14: uri
                "\"CREATOR\" TEXT," + // 15: creator
                "\"USER_ID\" INTEGER NOT NULL );"); // 16: user_id
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FEED\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Feed entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getTitle());
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(4, status);
        }
 
        Integer use_count = entity.getUse_count();
        if (use_count != null) {
            stmt.bindLong(5, use_count);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(6, description);
        }
 
        String feedtype = entity.getFeedtype();
        if (feedtype != null) {
            stmt.bindString(7, feedtype);
        }
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(8, link);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(9, icon);
        }
 
        java.util.Date publishtime = entity.getPublishtime();
        if (publishtime != null) {
            stmt.bindLong(10, publishtime.getTime());
        }
 
        java.util.Date update_time = entity.getUpdate_time();
        if (update_time != null) {
            stmt.bindLong(11, update_time.getTime());
        }
 
        String current_image = entity.getCurrent_image();
        if (current_image != null) {
            stmt.bindString(12, current_image);
        }
 
        String language = entity.getLanguage();
        if (language != null) {
            stmt.bindString(13, language);
        }
 
        String rights = entity.getRights();
        if (rights != null) {
            stmt.bindString(14, rights);
        }
 
        String uri = entity.getUri();
        if (uri != null) {
            stmt.bindString(15, uri);
        }
 
        String creator = entity.getCreator();
        if (creator != null) {
            stmt.bindString(16, creator);
        }
        stmt.bindLong(17, entity.getUser_id());
    }

    @Override
    protected void attachEntity(Feed entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Feed readEntity(Cursor cursor, int offset) {
        Feed entity = new Feed( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // url
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // status
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // use_count
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // description
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // feedtype
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // link
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // icon
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)), // publishtime
            cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)), // update_time
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // current_image
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // language
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // rights
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // uri
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // creator
            cursor.getLong(offset + 16) // user_id
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Feed entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.getString(offset + 1));
        entity.setUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStatus(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setUse_count(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setDescription(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFeedtype(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLink(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setIcon(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPublishtime(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
        entity.setUpdate_time(cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)));
        entity.setCurrent_image(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setLanguage(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRights(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setUri(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCreator(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setUser_id(cursor.getLong(offset + 16));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Feed entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Feed entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getUserDao().getAllColumns());
            builder.append(" FROM FEED T");
            builder.append(" LEFT JOIN USER T0 ON T.\"USER_ID\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Feed loadCurrentDeep(Cursor cursor, boolean lock) {
        Feed entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        User user = loadCurrentOther(daoSession.getUserDao(), cursor, offset);
         if(user != null) {
            entity.setUser(user);
        }

        return entity;    
    }

    public Feed loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Feed> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Feed> list = new ArrayList<Feed>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Feed> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Feed> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
