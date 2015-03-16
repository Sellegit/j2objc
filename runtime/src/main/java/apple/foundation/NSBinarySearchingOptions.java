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





@Library("Foundation/Foundation.h")
@Mapping("NSBinarySearchingOptions")
public final class NSBinarySearchingOptions extends ObjCEnum {
    
    @GlobalConstant("NSBinarySearchingFirstEqual")
    public static final long FirstEqual = 256L;
    @GlobalConstant("NSBinarySearchingLastEqual")
    public static final long LastEqual = 512L;
    @GlobalConstant("NSBinarySearchingInsertionIndex")
    public static final long InsertionIndex = 1024L;
    

}
