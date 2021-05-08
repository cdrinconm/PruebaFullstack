CREATE SEQUENCE public.inicial
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 4
  CACHE 1;
ALTER TABLE public.inicial
  OWNER TO postgres;

CREATE TABLE public.location
(
  id integer NOT NULL DEFAULT nextval('inicial'::regclass),
  name character varying(100),
  area_m2 integer,
  parentLoc integer,
  CONSTRAINT location_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.location
  OWNER TO postgres;