package apple.coreservices;


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
import apple.foundation.*;


@Library("CFNetwork/CFNetwork.h")
@Mapping("CFNetServiceOptions")
public final class CFNetServiceOptions extends ObjCEnum {
    
    @GlobalConstant("kCFNetServiceFlagNoAutoRename")
    public static final long NoAutoRename = 1L;


}
