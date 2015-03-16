package apple.corefoundation;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFMutableBitVector 
    extends CFBitVector 
     {

    
    
    
    
    
    @GlobalFunction("CFBitVectorCreateMutable")
    protected static native CFMutableBitVector createMutable(CFAllocator allocator, @MachineSizedSInt long capacity);
    @GlobalFunction("CFBitVectorCreateMutableCopy")
    protected static native CFMutableBitVector createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFBitVector bv);
    @GlobalFunction("CFBitVectorSetCount")
    public static native void setCount(CFBitVector bv, @MachineSizedSInt long count);
    @GlobalFunction("CFBitVectorFlipBitAtIndex")
    public static native void flipBitAtIndex(CFBitVector bv, @MachineSizedSInt long idx);
    @GlobalFunction("CFBitVectorFlipBits")
    public static native void flipBits(CFBitVector bv, CFRange range);
    @GlobalFunction("CFBitVectorSetBitAtIndex")
    public static native void setBitAtIndex(CFBitVector bv, @MachineSizedSInt long idx, int value);
    @GlobalFunction("CFBitVectorSetBits")
    public static native void setBits(CFBitVector bv, CFRange range, int value);
    @GlobalFunction("CFBitVectorSetAllBits")
    public static native void setAllBits(CFBitVector bv, int value);
    
}
