/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The mesh to draw into the stencil (or depth) buffer to perform early stencil (or depth) kills of pixels that will never appear on the HMD. This mesh draws
 * on all the pixels that will be hidden after distortion.
 * 
 * <p>If the HMD does not provide a visible area mesh {@code pVertexData} will be {@code NULL} and {@code unTriangleCount} will be 0.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct HiddenAreaMesh_t {
 *     {@link HmdVector2 HmdVector2_t} * pVertexData;
 *     uint32_t unTriangleCount;
 * }</pre></code>
 */
@NativeType("struct HiddenAreaMesh_t")
public class HiddenAreaMesh extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PVERTEXDATA,
        UNTRIANGLECOUNT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PVERTEXDATA = layout.offsetof(0);
        UNTRIANGLECOUNT = layout.offsetof(1);
    }

    HiddenAreaMesh(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link HiddenAreaMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HiddenAreaMesh(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdVector2.Buffer} view of the struct array pointed to by the {@code pVertexData} field. */
    @Nullable
    @NativeType("HmdVector2_t *")
    public HmdVector2.Buffer pVertexData() { return npVertexData(address()); }
    /** Returns the value of the {@code unTriangleCount} field. */
    @NativeType("uint32_t")
    public int unTriangleCount() { return nunTriangleCount(address()); }

    // -----------------------------------

    /** Returns a new {@link HiddenAreaMesh} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HiddenAreaMesh malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link HiddenAreaMesh} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HiddenAreaMesh calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link HiddenAreaMesh} instance allocated with {@link BufferUtils}. */
    public static HiddenAreaMesh create() {
        return new HiddenAreaMesh(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link HiddenAreaMesh} instance for the specified memory address. */
    public static HiddenAreaMesh create(long address) {
        return new HiddenAreaMesh(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HiddenAreaMesh createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link HiddenAreaMesh.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HiddenAreaMesh.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HiddenAreaMesh.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link HiddenAreaMesh.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HiddenAreaMesh.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link HiddenAreaMesh} instance allocated on the thread-local {@link MemoryStack}. */
    public static HiddenAreaMesh mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link HiddenAreaMesh} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HiddenAreaMesh callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link HiddenAreaMesh} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HiddenAreaMesh mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link HiddenAreaMesh} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HiddenAreaMesh callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HiddenAreaMesh.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HiddenAreaMesh.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HiddenAreaMesh.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HiddenAreaMesh.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HiddenAreaMesh.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pVertexData}. */
    @Nullable public static HmdVector2.Buffer npVertexData(long struct) { return HmdVector2.createSafe(memGetAddress(struct + HiddenAreaMesh.PVERTEXDATA), nunTriangleCount(struct)); }
    /** Unsafe version of {@link #unTriangleCount}. */
    public static int nunTriangleCount(long struct) { return memGetInt(struct + HiddenAreaMesh.UNTRIANGLECOUNT); }

    // -----------------------------------

    /** An array of {@link HiddenAreaMesh} structs. */
    public static class Buffer extends StructBuffer<HiddenAreaMesh, Buffer> implements NativeResource {

        /**
         * Creates a new {@link HiddenAreaMesh.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HiddenAreaMesh#SIZEOF}, and its mark will be undefined.
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
        protected HiddenAreaMesh newInstance(long address) {
            return new HiddenAreaMesh(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdVector2.Buffer} view of the struct array pointed to by the {@code pVertexData} field. */
        @Nullable
        @NativeType("HmdVector2_t *")
        public HmdVector2.Buffer pVertexData() { return HiddenAreaMesh.npVertexData(address()); }
        /** Returns the value of the {@code unTriangleCount} field. */
        @NativeType("uint32_t")
        public int unTriangleCount() { return HiddenAreaMesh.nunTriangleCount(address()); }

    }

}