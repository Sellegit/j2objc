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
@Mapping("UIImagePickerControllerCameraDevice")
public final class UIImagePickerControllerCameraDevice extends ObjCEnum {
    
    @GlobalConstant("UIImagePickerControllerCameraDeviceRear")
    public static final long Rear = 0L;
    @GlobalConstant("UIImagePickerControllerCameraDeviceFront")
    public static final long Front = 1L;


}
