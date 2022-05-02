package com.example.no_fa.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.no_fa.modules.Account;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PasswordDao_Impl implements PasswordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Account> __insertionAdapterOfTotp;

  private final EntityDeletionOrUpdateAdapter<Account> __deletionAdapterOfTotp;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PasswordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTotp = new EntityInsertionAdapter<Account>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `totps` (`id`,`domain`,`salt`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Account value) {
        stmt.bindLong(1, value.getId());
        if (value.getDomain() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDomain());
        }
        if (value.getSalt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSalt());
        }
      }
    };
    this.__deletionAdapterOfTotp = new EntityDeletionOrUpdateAdapter<Account>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `totps` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Account value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from totps";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Account account) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTotp.insert(account);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Account account) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTotp.handle(account);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<Account> getAll() {
    final String _sql = "SELECT * FROM totps";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDomain = CursorUtil.getColumnIndexOrThrow(_cursor, "domain");
      final int _cursorIndexOfSalt = CursorUtil.getColumnIndexOrThrow(_cursor, "salt");
      final List<Account> _result = new ArrayList<Account>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Account _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpDomain;
        if (_cursor.isNull(_cursorIndexOfDomain)) {
          _tmpDomain = null;
        } else {
          _tmpDomain = _cursor.getString(_cursorIndexOfDomain);
        }
        final String _tmpSalt;
        if (_cursor.isNull(_cursorIndexOfSalt)) {
          _tmpSalt = null;
        } else {
          _tmpSalt = _cursor.getString(_cursorIndexOfSalt);
        }
        _item = new Account(_tmpId,_tmpDomain,_tmpSalt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Account findByName(final String domain) {
    final String _sql = "SELECT * FROM totps WHERE domain LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (domain == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, domain);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDomain = CursorUtil.getColumnIndexOrThrow(_cursor, "domain");
      final int _cursorIndexOfSalt = CursorUtil.getColumnIndexOrThrow(_cursor, "salt");
      final Account _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpDomain;
        if (_cursor.isNull(_cursorIndexOfDomain)) {
          _tmpDomain = null;
        } else {
          _tmpDomain = _cursor.getString(_cursorIndexOfDomain);
        }
        final String _tmpSalt;
        if (_cursor.isNull(_cursorIndexOfSalt)) {
          _tmpSalt = null;
        } else {
          _tmpSalt = _cursor.getString(_cursorIndexOfSalt);
        }
        _result = new Account(_tmpId,_tmpDomain,_tmpSalt);
      } else {
        _result = null;
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
