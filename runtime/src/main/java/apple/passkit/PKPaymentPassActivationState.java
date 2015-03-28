package apple.passkit;


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
import apple.addressbook.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("PassKit/PassKit.h")
@Mapping("PKPaymentPassActivationState")
public final class PKPaymentPassActivationState extends ObjCEnum {
    
    @GlobalConstant("PKPaymentPassActivationStateActivated")
    public static final long Activated = 0L;
    @GlobalConstant("PKPaymentPassActivationStateRequiresActivation")
    public static final long RequiresActivation = 1L;
    @GlobalConstant("PKPaymentPassActivationStateActivating")
    public static final long Activating = 2L;
    @GlobalConstant("PKPaymentPassActivationStateSuspended")
    public static final long Suspended = 3L;
    @GlobalConstant("PKPaymentPassActivationStateDeactivated")
    public static final long Deactivated = 4L;


}
