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
    public native @MachineSizedSInt long getCount();
    @GlobalFunction("CFBitVectorGetCountOfBit")
    public native @MachineSizedSInt long getCountOfBit(CFRange range, int value);
    @GlobalFunction("CFBitVectorContainsBit")
    public native boolean containsBit(CFRange range, int value);
    @GlobalFunction("CFBitVectorGetBitAtIndex")
    public native int getBitAtIndex(@MachineSizedSInt long idx);
    @GlobalFunction("CFBitVectorGetBits")
    public native void getBits(CFRange range, Todo bytes);
    @GlobalFunction("CFBitVectorGetFirstIndexOfBit")
    public native @MachineSizedSInt long getFirstIndexOfBit(CFRange range, int value);
    @GlobalFunction("CFBitVectorGetLastIndexOfBit")
    public native @MachineSizedSInt long getLastIndexOfBit(CFRange range, int value);
    
}
