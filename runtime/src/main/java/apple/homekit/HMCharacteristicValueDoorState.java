package apple.homekit;


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



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("HMCharacteristicValueDoorState")
public final class HMCharacteristicValueDoorState extends ObjCEnum {
    
    @GlobalConstant("HMCharacteristicValueDoorStateOpen")
    public static final long Open = 0L;
    @GlobalConstant("HMCharacteristicValueDoorStateClosed")
    public static final long Closed = 1L;
    @GlobalConstant("HMCharacteristicValueDoorStateOpening")
    public static final long Opening = 2L;
    @GlobalConstant("HMCharacteristicValueDoorStateClosing")
    public static final long Closing = 3L;
    @GlobalConstant("HMCharacteristicValueDoorStateStopped")
    public static final long Stopped = 4L;
    

}
