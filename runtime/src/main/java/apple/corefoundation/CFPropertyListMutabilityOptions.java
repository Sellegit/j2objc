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





@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFPropertyListMutabilityOptions")
public final class CFPropertyListMutabilityOptions extends ObjCEnum {
    
    @GlobalConstant("kCFPropertyListImmutable")
    public static final long Immutable = 0L;
    @GlobalConstant("kCFPropertyListMutableContainers")
    public static final long MutableContainers = 1L;
    @GlobalConstant("kCFPropertyListMutableContainersAndLeaves")
    public static final long MutableContainersAndLeaves = 2L;
    

}
