package apple.notificationcenter;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("NotificationCenter")
public final class UIVibrancyEffectExtensions 
    extends NSExtensions 
     {

    
    
    private UIVibrancyEffectExtensions() {}
    
    
    
    
    
    
    @Mapping("notificationCenterVibrancyEffect")
    public static native UIVibrancyEffect createNotificationCenterEffect();
    
}
