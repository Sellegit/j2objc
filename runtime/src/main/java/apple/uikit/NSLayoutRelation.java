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
@Mapping("NSLayoutRelation")
public final class NSLayoutRelation extends ObjCEnum {
    
    @GlobalConstant("NSLayoutRelationLessThanOrEqual")
    public static final long LessThanOrEqual = -1L;
    @GlobalConstant("NSLayoutRelationEqual")
    public static final long Equal = 0L;
    @GlobalConstant("NSLayoutRelationGreaterThanOrEqual")
    public static final long GreaterThanOrEqual = 1L;


}
