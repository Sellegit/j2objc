package apple.eventkit;


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
import apple.addressbook.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("EventKit/EventKit.h") @Mapping("EKParticipant")
public class EKParticipant 
    extends EKObject 
    implements NSCopying {

    
    
    public EKParticipant() {}
    
    
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("name")
    public native String getName();
    @Mapping("participantStatus")
    public native EKParticipantStatus getParticipantStatus();
    @Mapping("participantRole")
    public native EKParticipantRole getParticipantRole();
    @Mapping("participantType")
    public native EKParticipantType getParticipantType();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isCurrentUser")
    public native boolean isCurrentUser();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("ABRecordWithAddressBook:")
    public native ABRecord getAddessBookRecord(ABAddressBook addressBook);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
