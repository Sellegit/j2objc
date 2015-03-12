package apple.addressbookui;


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





@Library("AddressBookUI") @Mapping("ABPersonViewControllerDelegate")
public interface ABPersonViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("personViewController:shouldPerformDefaultActionForPerson:property:identifier:")
    boolean shouldPerformDefaultAction(ABPersonViewController personViewController, ABRecord person, int property, int identifier);
    
    /*<adapter>*/
    /*</adapter>*/
}
