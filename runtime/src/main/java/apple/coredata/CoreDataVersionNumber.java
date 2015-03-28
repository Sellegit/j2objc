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

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreData/CoreData.h")
public class CoreDataVersionNumber 
    extends Object 
     {

    
    public static final double Version10_4 = 46.0;
    public static final double Version10_4_3 = 77.0;
    public static final double Version10_5 = 185.0;
    public static final double Version10_5_3 = 186.0;
    public static final double Version10_6 = 246.0;
    public static final double Version10_6_2 = 250.0;
    public static final double Version10_6_3 = 251.0;
    public static final double Version10_7 = 358.4;
    public static final double Version10_7_2 = 358.12;
    public static final double Version10_7_3 = 358.13;
    public static final double Version10_7_4 = 358.14;
    public static final double Version10_8 = 407.5;
    public static final double Version10_8_2 = 407.7;
    public static final double Version10_9 = 481.0;
    public static final double Version10_9_2 = 481.1;
    public static final double Version10_9_3 = 481.3;
    public static final double Version_iPhoneOS_3_0 = 241.0;
    public static final double Version_iPhoneOS_3_1 = 248.0;
    public static final double Version_iPhoneOS_3_2 = 310.2;
    public static final double Version_iPhoneOS_4_0 = 320.5;
    public static final double Version_iPhoneOS_4_1 = 320.11;
    public static final double Version_iPhoneOS_4_2 = 320.15;
    public static final double Version_iPhoneOS_4_3 = 320.17;
    public static final double Version_iPhoneOS_5_0 = 386.1;
    public static final double Version_iPhoneOS_5_1 = 386.5;
    public static final double Version_iPhoneOS_6_0 = 419.0;
    public static final double Version_iPhoneOS_6_1 = 419.1;
    public static final double Version_iPhoneOS_7_0 = 479.1;
    public static final double Version_iPhoneOS_7_1 = 479.3;

    
    
    
    
    @GlobalConstant("NSCoreDataVersionNumber")
    public static native double getVersion();

}
