--
-- PostgreSQL database dump
--

-- Dumped from database version 14.0
-- Dumped by pg_dump version 14.0

-- Started on 2021-12-19 18:47:28

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3620 (class 0 OID 36983)
-- Dependencies: 215
-- Data for Name: additional_service; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.additional_service VALUES (3, 'fff', 2, NULL);


--
-- TOC entry 3622 (class 0 OID 36990)
-- Dependencies: 217
-- Data for Name: address; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.address VALUES (6, 'gfsd', 'gsd', 'gfds');
INSERT INTO public.address VALUES (12, 'Michigan', 'USA', '5023 N Mason Rd Merrill');
INSERT INTO public.address VALUES (13, 'fsda', 'fsda', 'fdsa');
INSERT INTO public.address VALUES (14, 'htr', 'htr', 'htr');
INSERT INTO public.address VALUES (15, 'kuy', 'kuy', 'kuy');
INSERT INTO public.address VALUES (1, 'Iowa', 'USA', '19043 477th St Mystic');
INSERT INTO public.address VALUES (16, 'Michigan', 'USA', '5023 N Mason Rd Merrill');
INSERT INTO public.address VALUES (17, 'fdsa', 'fds', 'fsda');
INSERT INTO public.address VALUES (18, 'Subotica', 'Srbija', 'Beogradski put 217');
INSERT INTO public.address VALUES (19, 'Subotica', 'Srbija', 'Beogradski put 217');
INSERT INTO public.address VALUES (20, 'Subotica', 'Srbija', 'Beogradski put 217');
INSERT INTO public.address VALUES (21, 'jhkg', 'jkg', 'kjg');
INSERT INTO public.address VALUES (22, 'kjh', 'ggjk', 'kg');


--
-- TOC entry 3652 (class 0 OID 37126)
-- Dependencies: 247
-- Data for Name: role; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.role VALUES (1, 'ROLE_VACATION_HOME_OWNER');
INSERT INTO public.role VALUES (2, 'ROLE_CLIENT');


--
-- TOC entry 3662 (class 0 OID 37167)
-- Dependencies: 257
-- Data for Name: user_category; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3623 (class 0 OID 36998)
-- Dependencies: 218
-- Data for Name: admin; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3625 (class 0 OID 37006)
-- Dependencies: 220
-- Data for Name: appointment; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3626 (class 0 OID 37012)
-- Dependencies: 221
-- Data for Name: appointment_chosen_services; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3614 (class 0 OID 28578)
-- Dependencies: 209
-- Data for Name: appointment_services; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3630 (class 0 OID 37034)
-- Dependencies: 225
-- Data for Name: boat_owner; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3642 (class 0 OID 37091)
-- Dependencies: 237
-- Data for Name: location; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.location VALUES (6, 0, 0, 6, NULL);
INSERT INTO public.location VALUES (12, 0, 0, 12, NULL);
INSERT INTO public.location VALUES (13, 0, 0, 16, NULL);


--
-- TOC entry 3627 (class 0 OID 37017)
-- Dependencies: 222
-- Data for Name: boat; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3637 (class 0 OID 37070)
-- Dependencies: 232
-- Data for Name: fishing_equipment; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3628 (class 0 OID 37024)
-- Dependencies: 223
-- Data for Name: boat_fishing_equipment; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3644 (class 0 OID 37098)
-- Dependencies: 239
-- Data for Name: navigation_equipment; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3629 (class 0 OID 37029)
-- Dependencies: 224
-- Data for Name: boat_navigation_equipment; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3631 (class 0 OID 37041)
-- Dependencies: 226
-- Data for Name: client; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.client VALUES (17, false, 'fdasfdas', NULL, 'fdas', '$2a$10$wziOplQSsF89rvnlvCdU9e1WK1Fx0lg6Xqtt8cEzZ.GdS0BY5OPay', 'fdsa', 0, 'fdsa', 13, NULL, 2, 0, NULL, NULL);
INSERT INTO public.client VALUES (18, false, 'hrtw', NULL, 'thrw', '$2a$10$b39g/qdG964xw6QKmiwKX.Bh6xInRPjWGeuOqPv4GZeGa/tAVQjvi', 'htr', 0, 'htr', 14, NULL, 2, 0, NULL, NULL);
INSERT INTO public.client VALUES (19, false, 'kuy', NULL, 'kuy', '$2a$10$gIcwh8/gMxVgO0TmU3v1feVCnXfX0ZEhZ9Abmtf/L7CWih8rzOTvq', 'kuy', 0, 'kuy', 15, NULL, 2, 0, NULL, NULL);
INSERT INTO public.client VALUES (21, false, 'fdsa', NULL, 'fdsa', '$2a$10$IChZctmN5yfPp5wawmzEye19XhMOniYGmgxHbgJ.z7K1uef4Ojzzq', 'fds', 0, 'fds', 17, NULL, 2, 0, NULL, NULL);
INSERT INTO public.client VALUES (26, true, 'lea.kalmar@gmail.com', NULL, 'jh', '$2a$10$gUfXkVJ6kUz8LUFlN3HwOe4ZgadGIi79TEBacClRNve9rFuRh6crO', 'kg', 0, 'jgk', 22, NULL, 2, 0, NULL, NULL);


--
-- TOC entry 3632 (class 0 OID 37048)
-- Dependencies: 227
-- Data for Name: client_subscriptions; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3634 (class 0 OID 37054)
-- Dependencies: 229
-- Data for Name: confirmation_token; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.confirmation_token VALUES (1, 'homeOwner@gmail.com', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImhvbWVPd25lckBnbWFpbC5jb20iLCJhdWQiOiJ3ZWIiLCJpYXQiOjE2MzkxNDEwNzQsImV4cCI6MTYzOTE0Mjg3NH0.8ucLzCGtic9jLHs5BBh5aIIIW-6AQgS3nY1ypdcRueBmm7HqcNgIZs06SIsiAxRTFfy10BGqn62OQSre6pVLuQ');
INSERT INTO public.confirmation_token VALUES (2, 'fdasfdas', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImZkYXNmZGFzIiwiYXVkIjoid2ViIiwiaWF0IjoxNjM5MTY0MTczLCJleHAiOjE2MzkxNjU5NzN9.Vg3BnGaJQI4f2-OAkPXJE87OrWbA842dA5Ga-ZKEDd6xCBS4SpfcUp4Q_AT6bETWEAydQ7Axz6uQYigUGtvtHg');
INSERT INTO public.confirmation_token VALUES (3, 'hrtw', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImhydHciLCJhdWQiOiJ3ZWIiLCJpYXQiOjE2MzkxNjQyMTcsImV4cCI6MTYzOTE2NjAxN30.FrarJjQR1WPRnnu8pLjRwGbtB2u7Hc8icIAIY1RYcpGrgNH4is4qWzrMjAqjGbRrlIF1pfZ8lJGTfr-Jidr-RA');
INSERT INTO public.confirmation_token VALUES (4, 'kuy', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6Imt1eSIsImF1ZCI6IndlYiIsImlhdCI6MTYzOTE2NDI4MiwiZXhwIjoxNjM5MTY2MDgyfQ.xtEXLMoCFiM-JQTJ6k3-Jyp0c3L45lw-XJdQDMZAg8BRssdJGm--j4cIvPMxEhbojrEY_T8LnDFU6Dsbzel0Og');
INSERT INTO public.confirmation_token VALUES (5, 'fdsa', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImZkc2EiLCJhdWQiOiJ3ZWIiLCJpYXQiOjE2MzkxNzA0MTgsImV4cCI6MTYzOTE3MjIxOH0.A2_cIUZmwUjUCOuI8db8uR233-3KPM2xE7rt3lwMOGB5ewwwO23paSVN_xBjLM6OpC77qy1VRDqI_uQjTXvAtA');
INSERT INTO public.confirmation_token VALUES (6, 'lea.kalmar@gmail.com', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImxlYS5rYWxtYXJAZ21haWwuY29tIiwiYXVkIjoid2ViIiwiaWF0IjoxNjM5MTcxMDcxLCJleHAiOjE2MzkxNzI4NzF9.brqO45aHrVGA3TGrule50n03PqCtZeL6YDQecr5DYc8wPGYNYYDCo2bU6nCBbyBLhLo_vHCPT4NRKmkUoYAkDg');
INSERT INTO public.confirmation_token VALUES (7, 'lea.kalmar@gmail.com', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImxlYS5rYWxtYXJAZ21haWwuY29tIiwiYXVkIjoid2ViIiwiaWF0IjoxNjM5MTcxMTU3LCJleHAiOjE2MzkxNzI5NTd9.NUjoILuhSg8Ma3nkLJ4_2ORPK2LQCAhjb-w20CtgvxwwCeEGH4bBVKQW_pV9On-fYySwhM5nPo_hvRba1dIOlQ');
INSERT INTO public.confirmation_token VALUES (8, 'lea.kalmar@gmail.com', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImxlYS5rYWxtYXJAZ21haWwuY29tIiwiYXVkIjoid2ViIiwiaWF0IjoxNjM5MTcxODIyLCJleHAiOjE2MzkxNzM2MjJ9.ONbjWyvAhFErRn3r6lK9yiFb8leYcVAfdgUa8XpDFsW1ZSXtnWMzvc1doecCaiEmTJmA2mc0xDPndcZAymGWnQ');
INSERT INTO public.confirmation_token VALUES (9, 'lea.kalmar@gmail.com', 'eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktZXhhbXBsZSIsInN1YiI6ImxlYS5rYWxtYXJAZ21haWwuY29tIiwiYXVkIjoid2ViIiwiaWF0IjoxNjM5OTM0MzgyLCJleHAiOjE2Mzk5MzYxODJ9.VGVF-3wAAZvdDknirPp7XA240o5ehAlwTBD_0HeOxf1-LX9HJhkwDHyCykYo8WmLznciD__IR4PmWqRsWw6fLQ');


--
-- TOC entry 3638 (class 0 OID 37076)
-- Dependencies: 233
-- Data for Name: fishing_instructor; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3635 (class 0 OID 37062)
-- Dependencies: 230
-- Data for Name: fishing_adventure; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3615 (class 0 OID 28611)
-- Dependencies: 210
-- Data for Name: fishing_eq_in_boat; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3640 (class 0 OID 37084)
-- Dependencies: 235
-- Data for Name: image; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.image VALUES (1, 'c1.jpg', NULL);
INSERT INTO public.image VALUES (2, 'c3.jpg', NULL);


--
-- TOC entry 3616 (class 0 OID 28644)
-- Dependencies: 211
-- Data for Name: navigation_eq_in_boat; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3646 (class 0 OID 37105)
-- Dependencies: 241
-- Data for Name: reservation; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3648 (class 0 OID 37112)
-- Dependencies: 243
-- Data for Name: reservation_report; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3650 (class 0 OID 37119)
-- Dependencies: 245
-- Data for Name: review; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3665 (class 0 OID 37185)
-- Dependencies: 260
-- Data for Name: vacation_home_owner; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.vacation_home_owner VALUES (1, true, 'homeOwner@gmail.com', NULL, 'Marisa', '$2a$10$jE9Jzh8T5l/xn92gu6pfOOC/Y4tVRZNruktQFMM13FOSwxYuvSgc2', '704-249-0886', 0, 'Car', 1, NULL, 1, NULL, NULL);


--
-- TOC entry 3663 (class 0 OID 37173)
-- Dependencies: 258
-- Data for Name: vacation_home; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.vacation_home VALUES (16, 0, ' Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).', 'Lakeview Cottage', 3.89, 12, '2021-12-10 20:11:52.452', '2021-12-10 20:11:52.452', 1, NULL, NULL, NULL);
INSERT INTO public.vacation_home VALUES (20, 0, ' Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).', 'Villa Madam', 4.5, 13, '2021-12-10 21:55:01.501', '2021-12-10 21:55:01.501', 1, NULL, NULL, NULL);


--
-- TOC entry 3654 (class 0 OID 37133)
-- Dependencies: 249
-- Data for Name: room; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.room VALUES (1, 5, NULL);


--
-- TOC entry 3656 (class 0 OID 37140)
-- Dependencies: 251
-- Data for Name: rule; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.rule VALUES (2, 'ggfff', true);


--
-- TOC entry 3617 (class 0 OID 28691)
-- Dependencies: 212
-- Data for Name: rules_in_service_profile; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3657 (class 0 OID 37146)
-- Dependencies: 252
-- Data for Name: service_profile_additional_services; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.service_profile_additional_services VALUES (10, 3);


--
-- TOC entry 3658 (class 0 OID 37151)
-- Dependencies: 253
-- Data for Name: service_profile_appointments; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3659 (class 0 OID 37156)
-- Dependencies: 254
-- Data for Name: service_profile_images; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.service_profile_images VALUES (16, 2);
INSERT INTO public.service_profile_images VALUES (20, 1);


--
-- TOC entry 3660 (class 0 OID 37161)
-- Dependencies: 255
-- Data for Name: service_profile_rules; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.service_profile_rules VALUES (10, 2);


--
-- TOC entry 3618 (class 0 OID 28696)
-- Dependencies: 213
-- Data for Name: subscriptions; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3664 (class 0 OID 37180)
-- Dependencies: 259
-- Data for Name: vacation_home_rooms; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3672 (class 0 OID 0)
-- Dependencies: 214
-- Name: additional_service_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.additional_service_id_seq', 6, true);


--
-- TOC entry 3673 (class 0 OID 0)
-- Dependencies: 216
-- Name: address_address_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.address_address_id_seq', 22, true);


--
-- TOC entry 3674 (class 0 OID 0)
-- Dependencies: 219
-- Name: appointment_appointment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.appointment_appointment_id_seq', 1, false);


--
-- TOC entry 3675 (class 0 OID 0)
-- Dependencies: 228
-- Name: confirmation_token_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.confirmation_token_id_seq', 10, true);


--
-- TOC entry 3676 (class 0 OID 0)
-- Dependencies: 231
-- Name: fishing_equipment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.fishing_equipment_id_seq', 1, false);


--
-- TOC entry 3677 (class 0 OID 0)
-- Dependencies: 234
-- Name: image_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.image_id_seq', 1, false);


--
-- TOC entry 3678 (class 0 OID 0)
-- Dependencies: 236
-- Name: location_location_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.location_location_id_seq', 13, true);


--
-- TOC entry 3679 (class 0 OID 0)
-- Dependencies: 261
-- Name: my_seqv1; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.my_seqv1', 26, true);


--
-- TOC entry 3680 (class 0 OID 0)
-- Dependencies: 238
-- Name: navigation_equipment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.navigation_equipment_id_seq', 1, false);


--
-- TOC entry 3681 (class 0 OID 0)
-- Dependencies: 242
-- Name: reservation_report_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.reservation_report_id_seq', 1, false);


--
-- TOC entry 3682 (class 0 OID 0)
-- Dependencies: 240
-- Name: reservation_reservation_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.reservation_reservation_id_seq', 1, false);


--
-- TOC entry 3683 (class 0 OID 0)
-- Dependencies: 244
-- Name: review_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.review_id_seq', 1, false);


--
-- TOC entry 3684 (class 0 OID 0)
-- Dependencies: 246
-- Name: role_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.role_id_seq', 1, false);


--
-- TOC entry 3685 (class 0 OID 0)
-- Dependencies: 248
-- Name: room_room_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.room_room_id_seq', 4, true);


--
-- TOC entry 3686 (class 0 OID 0)
-- Dependencies: 250
-- Name: rule_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.rule_id_seq', 5, true);


--
-- TOC entry 3687 (class 0 OID 0)
-- Dependencies: 256
-- Name: user_category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user_category_id_seq', 1, false);


-- Completed on 2021-12-19 18:47:29

--
-- PostgreSQL database dump complete
--

