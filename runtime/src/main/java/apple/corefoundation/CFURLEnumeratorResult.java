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






@Mapping("CFURLEnumeratorResult")
public final class CFURLEnumeratorResult extends ObjCEnum {
    
    @GlobalConstant("kCFURLEnumeratorSuccess")
    public static final long Success = 1L;
    @GlobalConstant("kCFURLEnumeratorEnd")
    public static final long End = 2L;
    @GlobalConstant("kCFURLEnumeratorError")
    public static final long Error = 3L;
    @GlobalConstant("kCFURLEnumeratorDirectoryPostOrderSuccess")
    public static final long DirectoryPostOrderSuccess = 4L;
    

}
