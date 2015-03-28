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
@Mapping("UITableViewCellSeparatorStyle")
public final class UITableViewCellSeparatorStyle extends ObjCEnum {
    
    @GlobalConstant("UITableViewCellSeparatorStyleNone")
    public static final long None = 0L;
    @GlobalConstant("UITableViewCellSeparatorStyleSingleLine")
    public static final long SingleLine = 1L;
    @GlobalConstant("UITableViewCellSeparatorStyleSingleLineEtched")
    public static final long SingleLineEtched = 2L;


}
