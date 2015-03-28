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
@Mapping("NSDateComponentsFormatterZeroFormattingBehavior")
public final class NSDateComponentsFormatterZeroFormattingBehavior extends ObjCEnum {
    
    @GlobalConstant("NSDateComponentsFormatterZeroFormattingBehaviorNone")
    public static final long None = 0L;
    @GlobalConstant("NSDateComponentsFormatterZeroFormattingBehaviorDefault")
    public static final long Default = 1L;
    @GlobalConstant("NSDateComponentsFormatterZeroFormattingBehaviorDropLeading")
    public static final long DropLeading = 2L;
    @GlobalConstant("NSDateComponentsFormatterZeroFormattingBehaviorDropMiddle")
    public static final long DropMiddle = 4L;
    @GlobalConstant("NSDateComponentsFormatterZeroFormattingBehaviorDropTrailing")
    public static final long DropTrailing = 8L;
    @GlobalConstant("NSDateComponentsFormatterZeroFormattingBehaviorDropAll")
    public static final long DropAll = 14L;
    @GlobalConstant("NSDateComponentsFormatterZeroFormattingBehaviorPad")
    public static final long Pad = 65536L;


}
