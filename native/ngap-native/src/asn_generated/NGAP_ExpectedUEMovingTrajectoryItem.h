/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "NGAP-IEs"
 * 	found in "asn/NGAP-IEs.asn"
 * 	`asn1c -fcompound-names -findirect-choice -fno-include-deps -gen-PER -no-gen-OER -no-gen-example -D ngap -pdu=all`
 */

#ifndef	_NGAP_ExpectedUEMovingTrajectoryItem_H_
#define	_NGAP_ExpectedUEMovingTrajectoryItem_H_


#include <asn_application.h>

/* Including external dependencies */
#include "NGAP_NGRAN-CGI.h"
#include <NativeInteger.h>
#include <constr_SEQUENCE.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct NGAP_ProtocolExtensionContainer;

/* NGAP_ExpectedUEMovingTrajectoryItem */
typedef struct NGAP_ExpectedUEMovingTrajectoryItem {
	NGAP_NGRAN_CGI_t	 nGRAN_CGI;
	long	*timeStayedInCell;	/* OPTIONAL */
	struct NGAP_ProtocolExtensionContainer	*iE_Extensions;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} NGAP_ExpectedUEMovingTrajectoryItem_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_NGAP_ExpectedUEMovingTrajectoryItem;
extern asn_SEQUENCE_specifics_t asn_SPC_NGAP_ExpectedUEMovingTrajectoryItem_specs_1;
extern asn_TYPE_member_t asn_MBR_NGAP_ExpectedUEMovingTrajectoryItem_1[3];

#ifdef __cplusplus
}
#endif

#endif	/* _NGAP_ExpectedUEMovingTrajectoryItem_H_ */
#include <asn_internal.h>
