-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 17-03-2023 a las 02:13:31
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ds`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombre_cliente` varchar(50) NOT NULL,
  `mail_cliente` varchar(50) NOT NULL,
  `tel_cliente` varchar(50) NOT NULL,
  `dir_cliente` varchar(50) NOT NULL,
  `ultima_modificacion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='esta tabla es para registrar clientes';

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombre_cliente`, `mail_cliente`, `tel_cliente`, `dir_cliente`, `ultima_modificacion`) VALUES
(1, 'Angel Garcia', 'angel@ejemplo.com', '5567897321', 'av. de los maestros', 'juan_capturista'),
(2, 'Robert Alvarez', 'roberto@ejemplo.com', '5543271988', 'Avenida alta #45', 'juan_capturista');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `id_equipo` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `tipo_equipo` varchar(50) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `num_serie` varchar(50) NOT NULL,
  `dia_ingreso` varchar(50) NOT NULL,
  `mes_ingreso` varchar(50) NOT NULL,
  `anio_ingreso` varchar(50) NOT NULL,
  `observaciones` longtext NOT NULL,
  `status` varchar(50) NOT NULL,
  `ultima_modificacion` varchar(50) NOT NULL,
  `comentarios_tecnicos` longtext NOT NULL,
  `revision_tecnica_de` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para registrar equipos';

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`id_equipo`, `id_cliente`, `tipo_equipo`, `marca`, `modelo`, `num_serie`, `dia_ingreso`, `mes_ingreso`, `anio_ingreso`, `observaciones`, `status`, `ultima_modificacion`, `comentarios_tecnicos`, `revision_tecnica_de`) VALUES
(1, 1, 'Multifuncional', 'Brother', 'MFC9990', 'u345622', '15', '2', '2023', 'Equipo no enciende.', 'En revision', 'juan_capturista', 'En revision...', 'gerardo_tecnico'),
(2, 2, 'Desktop', 'Asus', '5589e2a', 'u2as432', '15', '2', '2023', 'No enciende.', 'Nuevo ingreso', 'brandon', '', ''),
(3, 2, 'Impresora', 'Hp', 'hp6754', 'r67543', '15', '2', '2023', 'No Imprime.', 'Entregado', 'juan_capturista', 'Ya imprime', 'gerardo_tecnico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `tipo_nivel` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `registrado_por` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='tabla para registrar usuarios';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_usuario`, `email`, `telefono`, `username`, `password`, `tipo_nivel`, `status`, `registrado_por`) VALUES
(1, 'Brandon Garcia', 'brandon@ejemplo.com', '5543456651', 'brandon', '123456', 'Administrador', 'Activo', 'brandon'),
(2, 'Juan Torres', 'juan@ejemplo.com', '5564357865', 'juan_capturista', '123456', 'Capturista', 'Activo', 'brandon'),
(3, 'Gerardo Tellez', 'gerardo@ejemplo.com', '5567898321', 'gerardo_tecnico', '123456', 'Tecnico', 'Activo', 'brandon'),
(4, 'Carlos Ortega', 'carlos@ejemplo.com', '5545436789', 'carlos', 'carlos123', 'Administrador', 'Activo', 'brandon');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`id_equipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `equipos`
--
ALTER TABLE `equipos`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
