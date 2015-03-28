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
@Mapping("CFMutableBitVectorRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFMutableBitVector 
    extends CFBitVector 
     {

    
    
    protected CFMutableBitVector() {}

    
    
    
    @GlobalFunction("CFBitVectorCreateMutable")
    public static native CFMutableBitVector createMutable(CFAllocator allocator, @MachineSizedSInt long capacity);
    @GlobalFunction("CFBitVectorCreateMutableCopy")
    public static native CFMutableBitVector createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFBitVector bv);
    @GlobalFunction("CFBitVectorSetCount")
    public static native void setCount(CFMutableBitVector bv, @MachineSizedSInt long count);
    @GlobalFunction("CFBitVectorFlipBitAtIndex")
    public static native void flipBitAtIndex(CFMutableBitVector bv, @MachineSizedSInt long idx);
    @GlobalFunction("CFBitVectorFlipBits")
    public static native void flipBits(CFMutableBitVector bv, CFRange range);
    @GlobalFunction("CFBitVectorSetBitAtIndex")
    public static native void setBitAtIndex(CFMutableBitVector bv, @MachineSizedSInt long idx, int value);
    @GlobalFunction("CFBitVectorSetBits")
    public static native void setBits(CFMutableBitVector bv, CFRange range, int value);
    @GlobalFunction("CFBitVectorSetAllBits")
    public static native void setAllBits(CFMutableBitVector bv, int value);

}
