/*
 * This file is generated by jOOQ.
 */
package generated_sources.tables.records;


import generated_sources.tables.Mahasiswa;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class MahasiswaRecord extends UpdatableRecordImpl<MahasiswaRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.mahasiswa.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mahasiswa.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.mahasiswa.nama</code>.
     */
    public void setNama(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mahasiswa.nama</code>.
     */
    public String getNama() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.mahasiswa.umur</code>.
     */
    public void setUmur(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mahasiswa.umur</code>.
     */
    public Integer getUmur() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Mahasiswa.MAHASISWA.ID;
    }

    @Override
    public Field<String> field2() {
        return Mahasiswa.MAHASISWA.NAMA;
    }

    @Override
    public Field<Integer> field3() {
        return Mahasiswa.MAHASISWA.UMUR;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getNama();
    }

    @Override
    public Integer component3() {
        return getUmur();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getNama();
    }

    @Override
    public Integer value3() {
        return getUmur();
    }

    @Override
    public MahasiswaRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MahasiswaRecord value2(String value) {
        setNama(value);
        return this;
    }

    @Override
    public MahasiswaRecord value3(Integer value) {
        setUmur(value);
        return this;
    }

    @Override
    public MahasiswaRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MahasiswaRecord
     */
    public MahasiswaRecord() {
        super(Mahasiswa.MAHASISWA);
    }

    /**
     * Create a detached, initialised MahasiswaRecord
     */
    public MahasiswaRecord(Integer id, String nama, Integer umur) {
        super(Mahasiswa.MAHASISWA);

        setId(id);
        setNama(nama);
        setUmur(umur);
        resetChangedOnNotNull();
    }
}