/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct SQL_TIMESTAMP_STRUCT {
 *     SQLSMALLINT year;
 *     SQLUSMALLINT month;
 *     SQLUSMALLINT day;
 *     SQLUSMALLINT hour;
 *     SQLUSMALLINT minute;
 *     SQLUSMALLINT second;
 *     SQLUINTEGER fraction;
 * }</pre></code>
 */
public class SQL_TIMESTAMP_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        YEAR,
        MONTH,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        FRACTION;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
        DAY = layout.offsetof(2);
        HOUR = layout.offsetof(3);
        MINUTE = layout.offsetof(4);
        SECOND = layout.offsetof(5);
        FRACTION = layout.offsetof(6);
    }

    SQL_TIMESTAMP_STRUCT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link SQL_TIMESTAMP_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_TIMESTAMP_STRUCT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code year} field. */
    @NativeType("SQLSMALLINT")
    public short year() { return nyear(address()); }
    /** Returns the value of the {@code month} field. */
    @NativeType("SQLUSMALLINT")
    public short month() { return nmonth(address()); }
    /** Returns the value of the {@code day} field. */
    @NativeType("SQLUSMALLINT")
    public short day() { return nday(address()); }
    /** Returns the value of the {@code hour} field. */
    @NativeType("SQLUSMALLINT")
    public short hour() { return nhour(address()); }
    /** Returns the value of the {@code minute} field. */
    @NativeType("SQLUSMALLINT")
    public short minute() { return nminute(address()); }
    /** Returns the value of the {@code second} field. */
    @NativeType("SQLUSMALLINT")
    public short second() { return nsecond(address()); }
    /** Returns the value of the {@code fraction} field. */
    @NativeType("SQLUINTEGER")
    public int fraction() { return nfraction(address()); }

    /** Sets the specified value to the {@code year} field. */
    public SQL_TIMESTAMP_STRUCT year(@NativeType("SQLSMALLINT") short value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public SQL_TIMESTAMP_STRUCT month(@NativeType("SQLUSMALLINT") short value) { nmonth(address(), value); return this; }
    /** Sets the specified value to the {@code day} field. */
    public SQL_TIMESTAMP_STRUCT day(@NativeType("SQLUSMALLINT") short value) { nday(address(), value); return this; }
    /** Sets the specified value to the {@code hour} field. */
    public SQL_TIMESTAMP_STRUCT hour(@NativeType("SQLUSMALLINT") short value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public SQL_TIMESTAMP_STRUCT minute(@NativeType("SQLUSMALLINT") short value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public SQL_TIMESTAMP_STRUCT second(@NativeType("SQLUSMALLINT") short value) { nsecond(address(), value); return this; }
    /** Sets the specified value to the {@code fraction} field. */
    public SQL_TIMESTAMP_STRUCT fraction(@NativeType("SQLUINTEGER") int value) { nfraction(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_TIMESTAMP_STRUCT set(
        short year,
        short month,
        short day,
        short hour,
        short minute,
        short second,
        int fraction
    ) {
        year(year);
        month(month);
        day(day);
        hour(hour);
        minute(minute);
        second(second);
        fraction(fraction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_TIMESTAMP_STRUCT set(SQL_TIMESTAMP_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link SQL_TIMESTAMP_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_TIMESTAMP_STRUCT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link SQL_TIMESTAMP_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_TIMESTAMP_STRUCT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link SQL_TIMESTAMP_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_TIMESTAMP_STRUCT create() {
        return new SQL_TIMESTAMP_STRUCT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link SQL_TIMESTAMP_STRUCT} instance for the specified memory address. */
    public static SQL_TIMESTAMP_STRUCT create(long address) {
        return new SQL_TIMESTAMP_STRUCT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_TIMESTAMP_STRUCT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link SQL_TIMESTAMP_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_TIMESTAMP_STRUCT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link SQL_TIMESTAMP_STRUCT} instance allocated on the thread-local {@link MemoryStack}. */
    public static SQL_TIMESTAMP_STRUCT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link SQL_TIMESTAMP_STRUCT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SQL_TIMESTAMP_STRUCT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_TIMESTAMP_STRUCT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_TIMESTAMP_STRUCT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_TIMESTAMP_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static short nyear(long struct) { return memGetShort(struct + SQL_TIMESTAMP_STRUCT.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static short nmonth(long struct) { return memGetShort(struct + SQL_TIMESTAMP_STRUCT.MONTH); }
    /** Unsafe version of {@link #day}. */
    public static short nday(long struct) { return memGetShort(struct + SQL_TIMESTAMP_STRUCT.DAY); }
    /** Unsafe version of {@link #hour}. */
    public static short nhour(long struct) { return memGetShort(struct + SQL_TIMESTAMP_STRUCT.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static short nminute(long struct) { return memGetShort(struct + SQL_TIMESTAMP_STRUCT.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static short nsecond(long struct) { return memGetShort(struct + SQL_TIMESTAMP_STRUCT.SECOND); }
    /** Unsafe version of {@link #fraction}. */
    public static int nfraction(long struct) { return memGetInt(struct + SQL_TIMESTAMP_STRUCT.FRACTION); }

    /** Unsafe version of {@link #year(short) year}. */
    public static void nyear(long struct, short value) { memPutShort(struct + SQL_TIMESTAMP_STRUCT.YEAR, value); }
    /** Unsafe version of {@link #month(short) month}. */
    public static void nmonth(long struct, short value) { memPutShort(struct + SQL_TIMESTAMP_STRUCT.MONTH, value); }
    /** Unsafe version of {@link #day(short) day}. */
    public static void nday(long struct, short value) { memPutShort(struct + SQL_TIMESTAMP_STRUCT.DAY, value); }
    /** Unsafe version of {@link #hour(short) hour}. */
    public static void nhour(long struct, short value) { memPutShort(struct + SQL_TIMESTAMP_STRUCT.HOUR, value); }
    /** Unsafe version of {@link #minute(short) minute}. */
    public static void nminute(long struct, short value) { memPutShort(struct + SQL_TIMESTAMP_STRUCT.MINUTE, value); }
    /** Unsafe version of {@link #second(short) second}. */
    public static void nsecond(long struct, short value) { memPutShort(struct + SQL_TIMESTAMP_STRUCT.SECOND, value); }
    /** Unsafe version of {@link #fraction(int) fraction}. */
    public static void nfraction(long struct, int value) { memPutInt(struct + SQL_TIMESTAMP_STRUCT.FRACTION, value); }

    // -----------------------------------

    /** An array of {@link SQL_TIMESTAMP_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_TIMESTAMP_STRUCT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link SQL_TIMESTAMP_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_TIMESTAMP_STRUCT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected SQL_TIMESTAMP_STRUCT newInstance(long address) {
            return new SQL_TIMESTAMP_STRUCT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code year} field. */
        @NativeType("SQLSMALLINT")
        public short year() { return SQL_TIMESTAMP_STRUCT.nyear(address()); }
        /** Returns the value of the {@code month} field. */
        @NativeType("SQLUSMALLINT")
        public short month() { return SQL_TIMESTAMP_STRUCT.nmonth(address()); }
        /** Returns the value of the {@code day} field. */
        @NativeType("SQLUSMALLINT")
        public short day() { return SQL_TIMESTAMP_STRUCT.nday(address()); }
        /** Returns the value of the {@code hour} field. */
        @NativeType("SQLUSMALLINT")
        public short hour() { return SQL_TIMESTAMP_STRUCT.nhour(address()); }
        /** Returns the value of the {@code minute} field. */
        @NativeType("SQLUSMALLINT")
        public short minute() { return SQL_TIMESTAMP_STRUCT.nminute(address()); }
        /** Returns the value of the {@code second} field. */
        @NativeType("SQLUSMALLINT")
        public short second() { return SQL_TIMESTAMP_STRUCT.nsecond(address()); }
        /** Returns the value of the {@code fraction} field. */
        @NativeType("SQLUINTEGER")
        public int fraction() { return SQL_TIMESTAMP_STRUCT.nfraction(address()); }

        /** Sets the specified value to the {@code year} field. */
        public SQL_TIMESTAMP_STRUCT.Buffer year(@NativeType("SQLSMALLINT") short value) { SQL_TIMESTAMP_STRUCT.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public SQL_TIMESTAMP_STRUCT.Buffer month(@NativeType("SQLUSMALLINT") short value) { SQL_TIMESTAMP_STRUCT.nmonth(address(), value); return this; }
        /** Sets the specified value to the {@code day} field. */
        public SQL_TIMESTAMP_STRUCT.Buffer day(@NativeType("SQLUSMALLINT") short value) { SQL_TIMESTAMP_STRUCT.nday(address(), value); return this; }
        /** Sets the specified value to the {@code hour} field. */
        public SQL_TIMESTAMP_STRUCT.Buffer hour(@NativeType("SQLUSMALLINT") short value) { SQL_TIMESTAMP_STRUCT.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public SQL_TIMESTAMP_STRUCT.Buffer minute(@NativeType("SQLUSMALLINT") short value) { SQL_TIMESTAMP_STRUCT.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public SQL_TIMESTAMP_STRUCT.Buffer second(@NativeType("SQLUSMALLINT") short value) { SQL_TIMESTAMP_STRUCT.nsecond(address(), value); return this; }
        /** Sets the specified value to the {@code fraction} field. */
        public SQL_TIMESTAMP_STRUCT.Buffer fraction(@NativeType("SQLUINTEGER") int value) { SQL_TIMESTAMP_STRUCT.nfraction(address(), value); return this; }

    }

}