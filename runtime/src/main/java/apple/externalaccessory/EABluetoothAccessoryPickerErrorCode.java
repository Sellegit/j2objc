package apple.externalaccessory;


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
import apple.uikit.*;
import apple.dispatch.*;





@Library("ExternalAccessory")
@Mapping("EABluetoothAccessoryPickerErrorCode")
public final class EABluetoothAccessoryPickerErrorCode extends ObjCEnum {
    
    @GlobalConstant("EABluetoothAccessoryPickerAlreadyConnected")
    public static final long AlreadyConnected = 0L;
    @GlobalConstant("EABluetoothAccessoryPickerResultNotFound")
    public static final long ResultNotFound = 1L;
    @GlobalConstant("EABluetoothAccessoryPickerResultCancelled")
    public static final long ResultCancelled = 2L;
    @GlobalConstant("EABluetoothAccessoryPickerResultFailed")
    public static final long ResultFailed = 3L;
    

}
