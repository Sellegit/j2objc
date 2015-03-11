package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation")
@Mapping("NSSortOptions")
public final class NSSortOptions extends ObjCEnum {
    
    @GlobalConstant("NSSortConcurrent")
    public static final long Concurrent = 1L;
    @GlobalConstant("NSSortStable")
    public static final long Stable = 16L;
    

}
