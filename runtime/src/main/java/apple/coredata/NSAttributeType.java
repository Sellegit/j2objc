package apple.coredata;


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


@Library("CoreData/CoreData.h")
@Mapping("NSAttributeType")
public final class NSAttributeType extends ObjCEnum {
    
    @GlobalConstant("NSUndefinedAttributeType")
    public static final long Undefined = 0L;
    @GlobalConstant("NSInteger16AttributeType")
    public static final long Integer16 = 100L;
    @GlobalConstant("NSInteger32AttributeType")
    public static final long Integer32 = 200L;
    @GlobalConstant("NSInteger64AttributeType")
    public static final long Integer64 = 300L;
    @GlobalConstant("NSDecimalAttributeType")
    public static final long Decimal = 400L;
    @GlobalConstant("NSDoubleAttributeType")
    public static final long Double = 500L;
    @GlobalConstant("NSFloatAttributeType")
    public static final long Float = 600L;
    @GlobalConstant("NSStringAttributeType")
    public static final long String = 700L;
    @GlobalConstant("NSBooleanAttributeType")
    public static final long Boolean = 800L;
    @GlobalConstant("NSDateAttributeType")
    public static final long Date = 900L;
    @GlobalConstant("NSBinaryDataAttributeType")
    public static final long BinaryData = 1000L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSTransformableAttributeType")
    public static final long Transformable = 1800L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSObjectIDAttributeType")
    public static final long ObjectID = 2000L;


}
