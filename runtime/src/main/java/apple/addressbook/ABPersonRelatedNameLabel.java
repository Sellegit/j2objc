package apple.addressbook;


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
@Library("AddressBook/AddressBook.h")
public class ABPersonRelatedNameLabel 
    extends ABPropertyLabel 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonFatherLabel")
    public static native CFString FatherLabel();
    @GlobalConstant("kABPersonMotherLabel")
    public static native CFString MotherLabel();
    @GlobalConstant("kABPersonParentLabel")
    public static native CFString ParentLabel();
    @GlobalConstant("kABPersonBrotherLabel")
    public static native CFString BrotherLabel();
    @GlobalConstant("kABPersonSisterLabel")
    public static native CFString SisterLabel();
    @GlobalConstant("kABPersonChildLabel")
    public static native CFString ChildLabel();
    @GlobalConstant("kABPersonFriendLabel")
    public static native CFString FriendLabel();
    @GlobalConstant("kABPersonSpouseLabel")
    public static native CFString SpouseLabel();
    @GlobalConstant("kABPersonPartnerLabel")
    public static native CFString PartnerLabel();
    @GlobalConstant("kABPersonAssistantLabel")
    public static native CFString AssistantLabel();
    @GlobalConstant("kABPersonManagerLabel")
    public static native CFString ManagerLabel();
    
}
