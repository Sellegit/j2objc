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
@Library("CoreFoundation")
public class CFMutableBitVector 
    extends CFBitVector 
     {

    
    
    
    
    
    @GlobalFunction("CFBitVectorCreateMutable")
    protected static native CFMutableBitVector createMutable(CFAllocator allocator, @MachineSizedSInt long capacity);
    @GlobalFunction("CFBitVectorCreateMutableCopy")
    protected static native CFMutableBitVector createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFBitVector bv);
    @GlobalFunction("CFBitVectorSetCount")
    public native void setCount(@MachineSizedSInt long count);
    @GlobalFunction("CFBitVectorFlipBitAtIndex")
    public native void flipBitAtIndex(@MachineSizedSInt long idx);
    @GlobalFunction("CFBitVectorFlipBits")
    public native void flipBits(CFRange range);
    @GlobalFunction("CFBitVectorSetBitAtIndex")
    public native void setBitAtIndex(@MachineSizedSInt long idx, int value);
    @GlobalFunction("CFBitVectorSetBits")
    public native void setBits(CFRange range, int value);
    @GlobalFunction("CFBitVectorSetAllBits")
    public native void setAllBits(int value);
    
}
