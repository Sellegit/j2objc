package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Mapping("NSFastEnumerationState") @Library("Foundation/Foundation.h")
public class NSFastEnumerationState 
    extends Struct 
     {

    
    protected NSFastEnumerationState() {}
    
    
    @DotMapping("state")
    public native @MachineSizedUInt long getState();
    @DotMapping("itemsPtr")
    public native Todo getItemsPtr();
    @DotMapping("mutationsPtr")
    public native Todo getMutationsPtr();
    
    public static native NSFastEnumerationState copyWithstate(NSFastEnumerationState original, @MachineSizedUInt long state) /*-[
        original.state = state;
        return original;
    ]-*/;

    
    public static native NSFastEnumerationState copyWithitemsPtr(NSFastEnumerationState original, Todo itemsPtr) /*-[
        original.itemsPtr = itemsPtr;
        return original;
    ]-*/;

    
    public static native NSFastEnumerationState copyWithmutationsPtr(NSFastEnumerationState original, Todo mutationsPtr) /*-[
        original.mutationsPtr = mutationsPtr;
        return original;
    ]-*/;

    
    
}
