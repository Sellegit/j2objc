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
@Mapping("UITableViewCellEditingStyle")
public final class UITableViewCellEditingStyle extends ObjCEnum {
    
    @GlobalConstant("UITableViewCellEditingStyleNone")
    public static final long None = 0L;
    @GlobalConstant("UITableViewCellEditingStyleDelete")
    public static final long Delete = 1L;
    @GlobalConstant("UITableViewCellEditingStyleInsert")
    public static final long Insert = 2L;
    

}
