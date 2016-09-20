/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author JuanCamilo
 */
public class FullBitSet extends BitSet {

    private int realSize;

    public FullBitSet() {
        this(0);
    }

    public FullBitSet(int realSize) {
        this.realSize = realSize;
    }

    public FullBitSet(BitSet bs, int realSize) {
        this.or(bs);
        this.realSize = realSize;
    }

    @Override
    public void set(int bitIndex) {
        super.set(bitIndex);
        if (bitIndex + 1 > realSize) {
            realSize = bitIndex + 1;
        }
    }

    @Override
    public void set(int bitIndex, boolean value) {
        super.set(bitIndex, value);
        if (bitIndex + 1 > realSize) {
            realSize = bitIndex + 1;
        }
    }

    public int getRealSize() {
        return realSize;
    }

    public void setRealSize(int realSize) {
        this.realSize = realSize;
    }

    /**
     *
     * @param cutPoints
     * @return a list of bitset of the current bitset split by the cutpoints
     */
    public List<FullBitSet> split(List<Integer> cutPoints) {
        List<FullBitSet> parts = new ArrayList<>();
        int temp = 0;
        for (Integer cp : cutPoints) {
            if (cp < 0 || cp >= realSize) {
                throw new IllegalArgumentException("bad cut point");
            }
            parts.add(new FullBitSet(this.get(temp, cp), cp - temp));
            temp = cp;
        }
        //add last part
        parts.add(new FullBitSet(this.get(temp, realSize), realSize - temp));
        return parts;
    }

    public List<FullBitSet> splitHalf() {
        return split(Collections.singletonList(realSize / 2));
    }

    public List<FullBitSet> split(int cutPoint) {
        return split(Collections.singletonList(cutPoint));
    }

    public List<FullBitSet> split6() {
        List<Integer> cutpoints = new ArrayList<>();
        cutpoints.add(6);
        cutpoints.add(12);
        cutpoints.add(18);
        cutpoints.add(24);
        cutpoints.add(30);
        cutpoints.add(36);
        cutpoints.add(42);
        return split(cutpoints);
    }

    public FullBitSet leftShift(int shift) {
        FullBitSet bs = new FullBitSet(realSize);
        int i;
        for (i = 0; i < realSize - shift; i++) {
            bs.set(i, this.get(i + shift));
        }
        for (i = realSize - shift; i < realSize; i++) {
            bs.set(i, this.get(i - (realSize - shift)));
        }
        return bs;
    }

    public FullBitSet rightShift(int shift) {
        FullBitSet bs = new FullBitSet(realSize);
        int i;
        for (i = 0; i < realSize - shift; i++) {
            bs.set(i + shift, this.get(i));
        }
        for (i = realSize - shift; i < realSize; i++) {
            bs.set(i - (realSize - shift), this.get(i));
        }
        return bs;
    }

    /**
     *
     * @param other
     * @return a new FullBitSet of fussion between this element and other
     * element
     */
    public FullBitSet fussion(FullBitSet other) {
        List<FullBitSet> parts = new ArrayList<>();
        parts.add(this);
        parts.add(other);
        return fussion(parts);
    }

    public static FullBitSet fussion(List<FullBitSet> elements) {
        FullBitSet bs = new FullBitSet();
        int temp = 0;
        for (FullBitSet element : elements) {
            for (int i = 0; i < element.getRealSize(); i++) {
                bs.set(i + temp, element.get(i));
            }
            temp += element.getRealSize();
        }
        return bs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < realSize; i++) {
            if (this.get(i)) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }

}
