/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "NGAP-IEs"
 * 	found in "asn/NGAP-IEs.asn"
 * 	`asn1c -fcompound-names -findirect-choice -fno-include-deps -gen-PER -no-gen-OER -no-gen-example -D ngap -pdu=all`
 */

#ifndef	_NGAP_GTP_TEID_H_
#define	_NGAP_GTP_TEID_H_


#include <asn_application.h>

/* Including external dependencies */
#include <OCTET_STRING.h>

#ifdef __cplusplus
extern "C" {
#endif

/* NGAP_GTP-TEID */
typedef OCTET_STRING_t	 NGAP_GTP_TEID_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_NGAP_GTP_TEID_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_NGAP_GTP_TEID;
asn_struct_free_f NGAP_GTP_TEID_free;
asn_struct_print_f NGAP_GTP_TEID_print;
asn_constr_check_f NGAP_GTP_TEID_constraint;
ber_type_decoder_f NGAP_GTP_TEID_decode_ber;
der_type_encoder_f NGAP_GTP_TEID_encode_der;
xer_type_decoder_f NGAP_GTP_TEID_decode_xer;
xer_type_encoder_f NGAP_GTP_TEID_encode_xer;
per_type_decoder_f NGAP_GTP_TEID_decode_uper;
per_type_encoder_f NGAP_GTP_TEID_encode_uper;
per_type_decoder_f NGAP_GTP_TEID_decode_aper;
per_type_encoder_f NGAP_GTP_TEID_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _NGAP_GTP_TEID_H_ */
#include <asn_internal.h>
