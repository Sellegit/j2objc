package apple.coreservices;


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
@Mapping("CFNetServiceBrowserRef") @Library("CFNetwork/CFNetwork.h")
public class CFNetServiceBrowser 
    extends CFType 
     {

    
    
    protected CFNetServiceBrowser() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserCreate")
    public static native CFNetServiceBrowser create(CFAllocator alloc, FunctionPtr clientCB, CFNetServiceClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserInvalidate")
    public static native void invalidate(CFNetServiceBrowser browser);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserSearchForDomains")
    public static native boolean searchForDomains(CFNetServiceBrowser browser, boolean registrationDomains, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserSearchForServices")
    public static native boolean searchForServices(CFNetServiceBrowser browser, CFString domain, CFString serviceType, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserStopSearch")
    public static native void stopSearch(CFNetServiceBrowser browser, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserScheduleWithRunLoop")
    public static native void schedule(CFNetServiceBrowser browser, CFRunLoop runLoop, CFString runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceBrowserUnscheduleFromRunLoop")
    public static native void unschedule(CFNetServiceBrowser browser, CFRunLoop runLoop, CFString runLoopMode);

}
