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
@Mapping("CFBitVectorRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFBitVector 
    extends CFType 
     {

    
    
    protected CFBitVector() {}
    
    
    
    
    @GlobalFunction("CFBitVectorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFBitVectorCreate")
    public static native CFBitVector create(CFAllocator allocator, Todo bytes, @MachineSizedSInt long numBits);
    @GlobalFunction("CFBitVectorCreateCopy")
    public static native CFBitVector createCopy(CFAllocator allocator, CFBitVector bv);
    @GlobalFunction("CFBitVectorGetCount")
    public static native @MachineSizedSInt long getCount(CFBitVector bv);
    @GlobalFunction("CFBitVectorGetCountOfBit")
    public static native @MachineSizedSInt long getCountOfBit(CFBitVector bv, CFRange range, int value);
    @GlobalFunction("CFBitVectorContainsBit")
    public static native boolean containsBit(CFBitVector bv, CFRange range, int value);
    @GlobalFunction("CFBitVectorGetBitAtIndex")
    public static native int getBitAtIndex(CFBitVector bv, @MachineSizedSInt long idx);
    @GlobalFunction("CFBitVectorGetBits")
    public static native void getBits(CFBitVector bv, CFRange range, Todo bytes);
    @GlobalFunction("CFBitVectorGetFirstIndexOfBit")
    public static native @MachineSizedSInt long getFirstIndexOfBit(CFBitVector bv, CFRange range, int value);
    @GlobalFunction("CFBitVectorGetLastIndexOfBit")
    public static native @MachineSizedSInt long getLastIndexOfBit(CFBitVector bv, CFRange range, int value);
    
}
