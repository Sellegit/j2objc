package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


@Library("UIKit/UIKit.h")
@Mapping("UICollectionUpdateAction")
public final class UICollectionUpdateAction extends ObjCEnum {
    
    @GlobalConstant("UICollectionUpdateActionInsert")
    public static final long Insert = 0L;
    @GlobalConstant("UICollectionUpdateActionDelete")
    public static final long Delete = 1L;
    @GlobalConstant("UICollectionUpdateActionReload")
    public static final long Reload = 2L;
    @GlobalConstant("UICollectionUpdateActionMove")
    public static final long Move = 3L;
    @GlobalConstant("UICollectionUpdateActionNone")
    public static final long None = 4L;


}
