package com.favorite.favouritebutton.ui;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteDao_Impl implements FavoriteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteModel> __insertionAdapterOfFavoriteModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteData;

  public FavoriteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteModel = new EntityInsertionAdapter<FavoriteModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_table` (`hindi`,`english`,`id`,`img`) VALUES (?,?,nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteModel value) {
        if (value.hindi == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.hindi);
        }
        if (value.english == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.english);
        }
        stmt.bindLong(3, value.id);
        stmt.bindLong(4, value.img);
      }
    };
    this.__preparedStmtOfDeleteData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favorite_table WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertAllData(final FavoriteModel model) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavoriteModel.insert(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteData(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteData.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteData.release(_stmt);
    }
  }

  @Override
  public List<FavoriteModel> getAllData() {
    final String _sql = "SELECT * FROM favorite_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "hindi");
      final int _cursorIndexOfEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "english");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
      final List<FavoriteModel> _result = new ArrayList<FavoriteModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FavoriteModel _item;
        final String _tmpHindi;
        if (_cursor.isNull(_cursorIndexOfHindi)) {
          _tmpHindi = null;
        } else {
          _tmpHindi = _cursor.getString(_cursorIndexOfHindi);
        }
        final String _tmpEnglish;
        if (_cursor.isNull(_cursorIndexOfEnglish)) {
          _tmpEnglish = null;
        } else {
          _tmpEnglish = _cursor.getString(_cursorIndexOfEnglish);
        }
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpImg;
        _tmpImg = _cursor.getInt(_cursorIndexOfImg);
        _item = new FavoriteModel(_tmpId,_tmpHindi,_tmpEnglish,_tmpImg);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean isFavorite(final int id) {
    final String _sql = "SELECT EXISTS (SELECT 1 FROM favorite_table WHERE id = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
