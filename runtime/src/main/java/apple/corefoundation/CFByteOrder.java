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






@Mapping("CFByteOrder")
public final class CFByteOrder extends ObjCEnum {
    
    @GlobalConstant("CFByteOrderUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("CFByteOrderLittleEndian")
    public static final long LittleEndian = 1L;
    @GlobalConstant("CFByteOrderBigEndian")
    public static final long BigEndian = 2L;
    

}
