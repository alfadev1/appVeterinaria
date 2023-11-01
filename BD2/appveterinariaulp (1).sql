-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2023 a las 15:50:24
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `appveterinariaulp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `nomAux` varchar(30) NOT NULL,
  `telAux` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `apellido`, `nombre`, `telefono`, `direccion`, `nomAux`, `telAux`, `estado`) VALUES
(1, 29860341, 'Salvo', 'Juan', 11234567, '0', 'Jorge', 11987654, 0),
(4, 123, 'mark', 'caren', 1234, 'dd', 'm', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idfactura` int(11) NOT NULL,
  `idVisita` int(11) NOT NULL,
  `tipoPago` varchar(12) NOT NULL,
  `pagoSN` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idmascota` int(11) NOT NULL,
  `alias` varchar(20) NOT NULL,
  `sexo` char(11) NOT NULL,
  `especie` varchar(20) NOT NULL,
  `raza` varchar(20) NOT NULL,
  `colorPelo` varchar(60) NOT NULL,
  `f_nac` date NOT NULL,
  `peso` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`idmascota`, `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `f_nac`, `peso`, `idCliente`, `estado`) VALUES
(1, 'pancho', 'f', 'perro', 'salchicha', 'marrón', '2023-11-02', 2, 1, 1),
(2, 'anchi', 'e', 'gato', 'gato', 'negro', '2023-11-01', 12, 4, 1),
(3, 'micho', 'f', 'gat', 'gat', 'marron', '2023-11-04', 12, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idtratamiento` int(11) NOT NULL,
  `tipo` varchar(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `importe` double(11,2) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idtratamiento`, `tipo`, `descripcion`, `importe`, `estado`) VALUES
(1, 'corte de pe', 'nn', 300.00, 1),
(2, 'vacuna', 'feo', 5000.00, 1),
(3, 'vacuna', 'sjahaj', 12.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idVisita` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `fechaVisita` date NOT NULL,
  `detalle` varchar(150) NOT NULL,
  `pesoActual` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`idVisita`, `idMascota`, `idTratamiento`, `fechaVisita`, `detalle`, `pesoActual`) VALUES
(1, 2, 2, '2023-11-03', 'hdjd', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idfactura`),
  ADD KEY `idVisita` (`idVisita`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idmascota`),
  ADD UNIQUE KEY `idCodigo` (`idmascota`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idtratamiento`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idMascota` (`idMascota`),
  ADD KEY `idTratamiento` (`idTratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `idfactura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idmascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idtratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`idVisita`) REFERENCES `visita` (`idVisita`);

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idmascota`),
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idtratamiento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
