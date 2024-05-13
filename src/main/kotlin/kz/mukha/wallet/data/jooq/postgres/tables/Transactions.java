/*
 * This file is generated by jOOQ.
 */
package kz.mukha.wallet.data.jooq.postgres.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import kz.mukha.wallet.data.jooq.postgres.Keys;
import kz.mukha.wallet.data.jooq.postgres.Wallet;
import kz.mukha.wallet.data.jooq.postgres.tables.TransactionItems.TransactionItemsPath;
import kz.mukha.wallet.data.jooq.postgres.tables.Wallets.WalletsPath;
import kz.mukha.wallet.data.jooq.postgres.tables.records.TransactionsRecord;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Transactions extends TableImpl<TransactionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>wallet.transactions</code>
     */
    public static final Transactions TRANSACTIONS = new Transactions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionsRecord> getRecordType() {
        return TransactionsRecord.class;
    }

    /**
     * The column <code>wallet.transactions.transaction_id</code>.
     */
    public final TableField<TransactionsRecord, UUID> TRANSACTION_ID = createField(DSL.name("transaction_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>wallet.transactions.wallet_id</code>.
     */
    public final TableField<TransactionsRecord, UUID> WALLET_ID = createField(DSL.name("wallet_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>wallet.transactions.operation_type</code>.
     */
    public final TableField<TransactionsRecord, String> OPERATION_TYPE = createField(DSL.name("operation_type"), SQLDataType.VARCHAR(63).nullable(false), this, "");

    /**
     * The column <code>wallet.transactions.description</code>.
     */
    public final TableField<TransactionsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>wallet.transactions.transaction_date</code>.
     */
    public final TableField<TransactionsRecord, LocalDateTime> TRANSACTION_DATE = createField(DSL.name("transaction_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>wallet.transactions.created_at</code>.
     */
    public final TableField<TransactionsRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>wallet.transactions.updated_at</code>.
     */
    public final TableField<TransactionsRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>wallet.transactions.org_title</code>.
     */
    public final TableField<TransactionsRecord, String> ORG_TITLE = createField(DSL.name("org_title"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>wallet.transactions.retail_place_address</code>.
     */
    public final TableField<TransactionsRecord, String> RETAIL_PLACE_ADDRESS = createField(DSL.name("retail_place_address"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>wallet.transactions.found_date</code>.
     */
    public final TableField<TransactionsRecord, LocalDateTime> FOUND_DATE = createField(DSL.name("found_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>wallet.transactions.kkm_fns_id</code>.
     */
    public final TableField<TransactionsRecord, String> KKM_FNS_ID = createField(DSL.name("kkm_fns_id"), SQLDataType.VARCHAR(63), this, "");

    /**
     * The column <code>wallet.transactions.fiscal_id</code>.
     */
    public final TableField<TransactionsRecord, String> FISCAL_ID = createField(DSL.name("fiscal_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>wallet.transactions.total_sum</code>.
     */
    public final TableField<TransactionsRecord, BigDecimal> TOTAL_SUM = createField(DSL.name("total_sum"), SQLDataType.NUMERIC(10, 3), this, "");

    private Transactions(Name alias, Table<TransactionsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Transactions(Name alias, Table<TransactionsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>wallet.transactions</code> table reference
     */
    public Transactions(String alias) {
        this(DSL.name(alias), TRANSACTIONS);
    }

    /**
     * Create an aliased <code>wallet.transactions</code> table reference
     */
    public Transactions(Name alias) {
        this(alias, TRANSACTIONS);
    }

    /**
     * Create a <code>wallet.transactions</code> table reference
     */
    public Transactions() {
        this(DSL.name("transactions"), null);
    }

    public <O extends Record> Transactions(Table<O> path, ForeignKey<O, TransactionsRecord> childPath, InverseForeignKey<O, TransactionsRecord> parentPath) {
        super(path, childPath, parentPath, TRANSACTIONS);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class TransactionsPath extends Transactions implements Path<TransactionsRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> TransactionsPath(Table<O> path, ForeignKey<O, TransactionsRecord> childPath, InverseForeignKey<O, TransactionsRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private TransactionsPath(Name alias, Table<TransactionsRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public TransactionsPath as(String alias) {
            return new TransactionsPath(DSL.name(alias), this);
        }

        @Override
        public TransactionsPath as(Name alias) {
            return new TransactionsPath(alias, this);
        }

        @Override
        public TransactionsPath as(Table<?> alias) {
            return new TransactionsPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Wallet.WALLET;
    }

    @Override
    public UniqueKey<TransactionsRecord> getPrimaryKey() {
        return Keys.TRANSACTIONS_PKEY;
    }

    @Override
    public List<ForeignKey<TransactionsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TRANSACTIONS__TRANSACTIONS_WALLET_ID_FKEY);
    }

    private transient WalletsPath _wallets;

    /**
     * Get the implicit join path to the <code>wallet.wallets</code> table.
     */
    public WalletsPath wallets() {
        if (_wallets == null)
            _wallets = new WalletsPath(this, Keys.TRANSACTIONS__TRANSACTIONS_WALLET_ID_FKEY, null);

        return _wallets;
    }

    private transient TransactionItemsPath _transactionItems;

    /**
     * Get the implicit to-many join path to the
     * <code>wallet.transaction_items</code> table
     */
    public TransactionItemsPath transactionItems() {
        if (_transactionItems == null)
            _transactionItems = new TransactionItemsPath(this, null, Keys.TRANSACTION_ITEMS__TRANSACTION_ITEMS_TRANSACTION_ID_FKEY.getInverseKey());

        return _transactionItems;
    }

    @Override
    public Transactions as(String alias) {
        return new Transactions(DSL.name(alias), this);
    }

    @Override
    public Transactions as(Name alias) {
        return new Transactions(alias, this);
    }

    @Override
    public Transactions as(Table<?> alias) {
        return new Transactions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Transactions rename(String name) {
        return new Transactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Transactions rename(Name name) {
        return new Transactions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Transactions rename(Table<?> name) {
        return new Transactions(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Transactions where(Condition condition) {
        return new Transactions(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Transactions where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Transactions where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Transactions where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Transactions where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Transactions where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Transactions where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Transactions where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Transactions whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Transactions whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
